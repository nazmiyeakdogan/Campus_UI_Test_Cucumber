Feature: Bank Accounts Functionality under Parameters

  Background:
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully
    And Click on the element in DashboardElements
      | setup       |
      | parameters  |
      | bankAccount |

  Scenario: Admin user should be able to add new bank account to positive test

    And Click on the button
      | addButton |

    And Enter new account information
      | nameInput | AAzbC100223 |
      | ibanInput | 9813355138  |

    And Click on the button
      | currency   |
      | EURInput   |
      | saveButton |

    Then Success message should be displayed

  Scenario: Admin user should be able to add new bank account to negative test

    And Click on the button
      | addButton |

    And Enter new account information
      | nameInput | AAzbC100223 |
      | ibanInput | 9813355138  |

    And Click on the button
      | currency   |
      | EURInput   |
      | saveButton |

    Then Already exists message should be displayed

  Scenario: Admin user should be able to search and edit bank account

    When Admin user searches for registered bank account
      | searchNameInput | AAzbC100223 |

    And Click on the button
      | searchButton |
      | editButton   |

    And Enter new account information
      | nameInput | BAzbC100223 |

    And Click on the button
      | saveButton |

    Then Success message should be displayed













