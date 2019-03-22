@echo off
java -jar .\antlr-4.7.2.jar Sauro.g

IF %ERRORLEVEL% EQU 0 ( 
  goto exp
) ELSE ( 
  goto erro
)

:exp
C:"\Program Files\Java\jdk1.8.0_191\bin\javac.exe" -cp antlr-4.7.2.jar Sauro*.java
IF %ERRORLEVEL% EQU 0 ( 
  goto sucesso
) ELSE ( 
  goto erro
)

:erro
@echo Um erro ocorreu :(

:sucesso
@echo 1_build.bat executado com sucesso!
call 2_compile.bat teste.dino