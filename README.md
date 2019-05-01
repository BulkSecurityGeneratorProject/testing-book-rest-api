# Bookstore	RESTful	API

## Development

To start your application in the dev profile, simply run:

    ./mvnw

### Login
POST: /oauth/token

This is	the	user login authentication API. The request and response	should be over a secured	
communication
##### Request:
    {"username":"john.doe",	"password":	"thisismysecret"}
    
### Get User
GET  /api/users

### Delete users
DELETE  /api/users

*Login required

### Create user
POST /users

##### Request:
    {"login": "john.doe", "password": "thisismysecret", "email": "john.doe@email.com"}

### Create order
POST /api/users/orders

*Login required

##### Request:
    {"orders": [1, 4]}
    
##### Response: 
    {"price": 519.00}
    
### Get Book

GET /api/books

##### Response: 
    [
        {
            "id": 1,
            "price": 340,
            "book_name": "Before We Were Yours: A Novel",
            "author_name": "Lisa Wingate",
            "is_recommended": false
        },
        {
            "id": 2,
            "price": 179,
            "book_name": "When Never Comes",
            "author_name": "Barbara Davis",
            "is_recommended": false
        }
    ]
    
### Postman
    ./scb-testing.postman_collection.json
