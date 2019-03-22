@echo off

C:"\Program Files\Java\jdk1.8.0_191\bin\java.exe" -cp "antlr-4.7.2.jar;." SauroParser < %1 > Test.j
IF %ERRORLEVEL% EQU 0 ( 
  goto jasmin
) ELSE ( 
  goto erro
)

:jasmin
C:"\Program Files\Java\jdk1.8.0_191\bin\java.exe" -jar jasmin-2.4.jar Test.j
IF %ERRORLEVEL% EQU 0 ( 
  goto test
) ELSE ( 
  goto erro
)

:test
C:"\Program Files\Java\jdk1.8.0_191\bin\java.exe" Test
IF %ERRORLEVEL% EQU 0 ( 
  goto sucesso
) ELSE ( 
  goto erro
)

:erro
@echo Um erro ocorreu

:sucesso
@echo 2_compile.bat executado com sucesso!