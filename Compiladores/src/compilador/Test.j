.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
        ldc 2
        istore 1

        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc " " 
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        iload 1
        imul
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc " " 
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        iload 1
        imul
        iload 1
        imul
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 2
.limit stack 5
.end method
; symbols: [args, a]
