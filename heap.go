package main

import (
	"fmt"

	"github.com/go-pg/pg/v10"
	"github.com/go-pg/pg/v10/orm"
)

type ReviewRequest struct {
	tableName struct{} `pg:"review_requests"`
	PRURL     string   `pg:"pr_url"`
}

func main() {
	// Connect to the database
	db := pg.Connect(&pg.Options{
		User:     "your_username",
		Password: "your_password",
		Database: "your_database",
	})

	// Close the database connection when done
	defer db.Close()

	// Query the database
	userID := "your_user_id"
	repositoryID := "your_repository_id"
	var reviewRequest ReviewRequest
