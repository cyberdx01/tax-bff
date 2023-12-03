# Getting Started

### Dependencies
Before using this microservice, ensure the following module is running / built beforehand:

* [tax-svc](https://github.com/cyberdx01/tax-svc)
* [tax-sdk](https://github.com/cyberdx01/tax-sdk)
* [tax-model](https://github.com/cyberdx01/tax-model)


### Guides
The following guides shows how to start this microservice:

* Run maven build using "clean install -U"
* Right click on the TaxApplication file and select "Run TaxApplication.main()"
* If there is no error, the microservice will run on port 8080 (adjustable in application.properties)
* Use postman to call to microservice

### Sample Request
The following is a sample GET request that can be used to call this microservice:

* http://localhost:8080/tax?annualIncome=100000

### Sample Response
The following is a sample JSON response that the microservice will return upon success:

* {"taxAmount":9400.0,"taxSlab":"CATEGORY_F","taxClaimOptions":[{"description":"Individual and dependent relatives","amount":9000.0},{"description":"Medical treatment, special needs and carer expenses for parents","amount":8000.0},{"description":"Purchase of basic supporting equipment for disabled self, spouse, child or parent","amount":6000.0},{"description":"Disabled individual","amount":6000.0},{"description":"Education fees (Self)","amount":7000.0},{"description":"Medical expenses","amount":8000.0},{"description":"Lifestyle – Expenses for the use / benefit of self, spouse or child","amount":2500.0},{"description":"Lifestyle – Additional relief for the use / benefit of self, spouse or child","amount":500.0},{"description":"Lifestyle – Purchase of personal computer, smartphone or tablet for own use / benefit or for spouse or child and not for business use","amount":2500.0},{"description":"Purchase of breastfeeding equipment for own use for a child aged 2 years and below (Deduction allowed once in every TWO (2) years of assessment)","amount":1000.0},{"description":"Child care fees to a registered child care centre / kindergarten for a child aged 6 years and below","amount":3000.0},{"description":"Net deposit in Skim Simpanan Pendidikan Nasional (Net deposit is the total deposit in 2022 MINUS total withdrawal in 2022)","amount":8000.0},{"description":"Husband / wife / payment of alimony to former wife","amount":4000.0},{"description":"Disabled husband / wife","amount":5000.0},{"description":"Each unmarried child and under the age of 18 years old","amount":2000.0},{"description":"Each unmarried child of 18 years and above who is receiving full-time education","amount":2000.0},{"description":"Each unmarried child of 18 years and above that receiving further education in Malaysia in respect of an award of diploma or higher","amount":8000.0},{"description":"Disabled child","amount":6000.0},{"description":"Additional exemption of RM8,000 disable child age 18 years old and above, not married and pursuing diplomas or above qualification in Malaysia @ bachelor degree or above outside Malaysia in program and in Higher Education Institute that is accredited by related Government authorities","amount":8000.0},{"description":"Life insurance and EPF","amount":7000.0},{"description":"Deferred Annuity and Private Retirement Scheme (PRS)","amount":3000.0},{"description":"Education and medical insurance","amount":3000.0},{"description":"Contribution to the Social Security Organization (SOCSO)","amount":350.0},{"description":"Domestic tourism expenses","amount":1000.0},{"description":"Expenses on charging facilities for Electric Vehicle (Not for business use)","amount":2500.0}]}
