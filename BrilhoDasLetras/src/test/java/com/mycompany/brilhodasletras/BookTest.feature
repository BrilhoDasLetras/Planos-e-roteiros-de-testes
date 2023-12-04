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
