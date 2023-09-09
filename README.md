# TrailAnywhere

## Introduction

TrailAnywhere is an app to help users search for hiking trails. Using a zip code, longitude/latitude coordinates, difficulty rating, or
type of trail, the app will search for a list of trails that fall within the given user input.

Other features will include adding new trails, adding alerts to a trail, like Waze app alerts, and seeing what the current weather report is based on a 
trails zip code. 

Because TrailAnywhere is a microservice, users can interact with this application using either a set of RESTFul service endpoints, a simple UI, or both.

## Storyboard

[TrailAnywhere Storyboard in Invision](https://nate965053.invisionapp.com/freehand/TrailAnywhere-BAHo9RwnD)

## Requirements

### 1. Hikers would like the ability to search for information about hiking trails.

#### Example

**Given**: Trail data is available and there are 2 trails rated “Difficult”

**When**: The user searches for trails with the constraint “Difficult”

**Then**: TrailAnywhere returns 2 hiking trails, rated “Difficult”

#### Example

**Given**: Trail data is available

**When**: The User searches “Bajs784jds” in the trail field

**Then**: TrailAnywhere does not return results

#### Example

**Given**: Trail data is available and has a "Forrest Park" entry

**When**: The user searches for “Forest Park”

**Then**: TrailAnywhere returns information/attributes for “Forest Park”

#### Example

**Given**: Trail data is available, “Mount Airy” is the only trail in the zip code 45239

**When**: The User enters “45239” in the zip code field

**Then**: TrailAnywhere returns one trail, “Mount Airy”

### 2.	Hikers would like to know about weather details for .

#### Example

**Given**: 

**When**: 

**Then**:

#### Example

**Given**: 

**When**: 

**Then**: 

#### Example

**Given**: 

**When**: 

**Then**:

### 3.  Hikers would like to search for and add alerts relating to specific trails.
#### Example

**Given**: 

**When**: 

**Then**: 

#### Example

**Given**: 

**When**: 

**Then**: 

## Class Diagram

![My Trail Anywhere Diagram](https://mailuc-my.sharepoint.com/:u:/g/personal/oterokh_mail_uc_edu/EWVWzCi2ScVNl_gkUfbfb9gBpNXzSorhuGdV_UclySsCHw?e=8GpgNy)

### Class Diagram Description

## JSON Schema

- TODO - REDO
This is what we plan to export to another app.


> {
>  "type" : "object",
>  "properties" : {
>    "name" : {
>      "type" : "string"
>    },
>    "age" : {
>      "type" : "integer"
>    }
>  }
> }

## Team Memebers and Roles

UI Specialist: Nate Virgin  
Business Logic/Persistence: Kenneth Otero  
Database/Data Engineer, Role Floater: Kayla Neely  
DevOps/Product Owner/Scrum Master/GitHub Admin: Wesley Ryther

## Milestones

[Milestone 1 TODO]()

## Standup

[6:30 PM EST Thursdays on Teams](https://teams.microsoft.com/l/meetup-join/19%3ameeting_NjQ4NmQ2MjgtYWE0Zi00OTgzLTg2YjMtNWFlYTNkMjdkYjNk%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%2259195007-8da2-458f-bfcc-0bc8c21540dd%22%7d)


