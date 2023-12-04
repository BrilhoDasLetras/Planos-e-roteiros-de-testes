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



Feature: Library Management

  Scenario: Register a Writer
    Given a Library Manager
    When a Writer with name "testName", birthdate "01/08/1998", email "test@test", username "testUser", password "1234", and biography "testBiography" is registered
    Then the Writer should be added to the list of Writers in the Library Manager

  Scenario: Register a Reader
    Given a Library Manager
    When a Reader with name "testName", birthdate "01/08/1998", email "test@test", username "testUser", password "1234", and biography "testBiography" is registered
    Then the Reader should be added to the list of Readers in the Library Manager

  Scenario: Register a Book
    Given a Library Manager
    And a Writer with name "testName", birthdate "01/08/1998", email "test@test", username "testUser", password "1234", and biography "testBiography" is registered
    When a Book with title "Book Title", description "testDescription", genre "testGenre", publication year 2000, and ISBN "12345" is registered in the Library Manager
    Then the Book should be added to the list of all books in the Library Manager
    And the Writer should be the first Writer in the list of Writers
    And the Book should be associated with the Writer

  Scenario: Find a Reader by Username
    Given a Library Manager
    And a Reader with name "testName", birthdate "01/08/1998", email "test@test", username "testUser", password "1234", and biography "testBiography" is registered
    When searching for a Reader with the username "testUser"
    Then the found Reader should be the same as the registered Reader

  Scenario: Find a Writer by Username
    Given a Library Manager
    And a Writer with name "testName", birthdate "01/08/1998", email "test@test", username "testUser", password "1234", and biography "testBiography" is registered
    When searching for a Writer with the username "testUser"
    Then the found Writer should be the same as the registered Writer

  Scenario: Find a Book by Title
    Given a Library Manager
    And a Writer with name "testName", birthdate "01/08/1998", email "test@test", username "testUser", password "1234", and biography "testBiography" is registered
    And a Book with title "Book Title", description "testDescription", genre "testGenre", publication year 2000, and ISBN "12345" is registered in the Library Manager
    When searching for a Book with the title "Book Title"
    Then the found Book should be the same as the registered Book

Feature: Book Test Scenarios

  Scenario: User retrieves the title of a book
    Given a book with the title "Sample Book"
    When the user requests the title of the book
    Then the system should return the title "Sample Book"

  Scenario: User retrieves the name of the author
    Given a book with the author's name "testName"
    When the user requests the name of the author
    Then the system should return the name "testName"

  Scenario: User retrieves the description of a book
    Given a book with the description "Sample description"
    When the user requests the description of the book
    Then the system should return the description "Sample description"

  Scenario: User views detailed information about a book
    Given a book with the title "Sample Book", author "testName", description "Sample description", genre "Sample Genre", published in 2022, and ISBN "1234567890"
    When the user requests the detailed information about the book
    Then the system should display:
      """
      Book{
        title='Sample Book',
        author=testName,
        description='Sample description',
        genre='Sample Genre',
        yearPublished=2022,
        ISBN='1234567890'}
      """

