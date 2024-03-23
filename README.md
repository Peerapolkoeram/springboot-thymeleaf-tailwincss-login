# springboot-thymeleaf-tailwincss-login

## Intall tailwincss
#### step 1 create package.json
 ``` shell
 npm init -y
 ``` 

#### step 2 create package-lock.json
 ``` shell
 npm i -d tailwindcss
 ``` 

#### step 3 create tailwind.config.js
 ``` shell
 npx tailwindcss init
 ``` 

#### step 4 
- add tailwind.config.js
  -  content: ["./src/main/resources/templates/**/*.html"]
- run script
 ``` shell
 npx tailwindcss -i ./src/main/resources/static/css/input.css -o ./src/main/resources/static/css/output.css --watch
 ``` 
