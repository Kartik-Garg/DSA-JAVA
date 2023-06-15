package main

import (
	"fmt"

	"github.com/go-pg/pg/v10"
	"github.com/go-pg/pg/v10/orm"
)



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
	// Access the PRURL field
	prURL := reviewRequest.PRURL
	fmt.Println("PR URL:", prURL)
}
