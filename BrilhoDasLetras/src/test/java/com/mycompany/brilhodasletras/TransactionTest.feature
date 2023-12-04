# Feature: Get Reader Details

Scenario: Verify that the transaction returns the correct reader details
  Given a transaction is created with a reader named "Alice"
  When I get the reader details from the transaction
  Then the reader's name should be "Alice"

# Feature: Get Book Details

Scenario: Verify that the transaction returns the correct book details
  Given a transaction is created with a book titled "Sample Book"
  When I get the book details from the transaction
  Then the book title should be "Sample Book"

# Feature: Get Transaction Amount

Scenario: Verify that the transaction returns the correct amount
  Given a transaction is created with an amount of 20.0
  When I get the transaction amount
  Then the amount should be 20.0

# Feature: Get Transaction Date

Scenario: Verify that the transaction returns a valid transaction date
  Given a transaction is created
  When I get the transaction date
  Then the transaction date should not be null
