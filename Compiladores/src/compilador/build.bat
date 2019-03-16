java -jar .\antlr-4.7.2.jar Exp.g

echo off
IF %ERRORLEVEL% EQU 0 ( 
  goto exp
) ELSE ( 
  goto erro
)

:exp
C:"\Program Files\Java\jdk1.8.0_191\bin\javac.exe" -cp antlr-4.7.2.jar Exp*.java
IF %ERRORLEVEL% EQU 0 ( 
  goto sucesso
) ELSE ( 
  goto erro
)

:erro
@echo Um erro ocorreu :(

:sucesso
@echo Tudo executado com sucesso!