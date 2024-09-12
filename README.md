Farm APIs 
- Implemented below two endpoints.
- Whitelisted these APIS alone in WebSecurityConfigurer adaptor
- Used H2 inmemory database


Input
POST http://localhost:8080/farmname/{{farmname}}/seasonname/{{seasonname}}

Example:
http://localhost:8080/farmname/farm1/seasonname/sess1
{
    "area": 100,
    "cropType": "bean",
    "amountInTons": 50
}
Response:
{
    "cropId": "0b5cfbe8-bcee-4a44-9639-51a7e527b6eb"
}

PUT http://localhost:8080/cropdetails/{{corpId}}

Example:
http://localhost:8080/cropdetails/0b5cfbe8-bcee-4a44-9639-51a7e527b6eb
{

    "amountHarvested": 40
}
Response
{
    "farmName": "farm1",
    "corpId": "0b5cfbe8-bcee-4a44-9639-51a7e527b6eb",
    "plantingArea": 100,
    "cropName": "bean",
    "expectedInTons": 50,
    "actualInTons": 40,
    "season": "sess1"
}
