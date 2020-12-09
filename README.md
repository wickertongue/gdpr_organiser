## Status 
Currently, this code creates a postgresqp database containing one table, called 'clients'. This table saves a 'name' 
and a 'type'. 

## To Do
Expand 'Client'' to include arrays, and new classes will need to be created for 'Person', 'Matter'. 

- A 'Client' can have many 'Persons', and a 'Person' can be many 'Clients'.
- A 'Client' can have many 'Matters', but a 'Matter' can only have one 'Client'.

For example, a Client can be of type Organisation, an Organisation contains many Persons. A Person can be a 
Client as part of an Organisation, but also as an Individual, or as a Married Couple. In the case of an Organisation,
the Client is not the Person or Persons involved in the Organisation, but is the Organisation itself. The same is true 
for a Married Couple.

In relation to Matters, a Client can have many Matters but a Matter can have only one Client. 

## Complications
In the construction above, a Client of type Individual could contain more than one Person as it could still contain 
an array of Persons. How can this be mitigated by the current model - or, does the model need to be rethought?