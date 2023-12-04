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
