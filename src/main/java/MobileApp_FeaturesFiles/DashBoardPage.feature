Feature: Check all the Mainu options for CureBay App


@Sanity
  Scenario: Check all settings option for CureBay App
    When User is on dashboard page and press mainu button
    And Check the below menation all the mainu items are avalible
      | options           |
      | Curebay Experince |
      | Care Plans        |
      | About Us          |
      | Doctor            |
      | Service Partners  |
      | Locations         |
      | Reviews           |
      | Articles          |
      | Our Team          |
