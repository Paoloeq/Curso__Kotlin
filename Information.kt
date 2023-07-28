//METODOS DE OPERACIÓN NUMERICA
2.times(3) //6
3.5.plus(4) //7.5
2.4.div(2) //1.2


//TIPOS DE OPERANDO
6*50 //300
6.0*50.0 //300.0
6.0*50 //300.0
1/2 // 0
1.0/2.0 //0.5


//CONVERSION DE TIPOS
val i: Int = 6
val b: Byte = i 
println(i.toByte()) //6


//CADENAS
val s1 = "Hello world!"
val s2 = "Hello World!\n"
val text = """var bikes = 50"""


//UNION DE CADENAS
val numberofDogs = 3
val numberofCats = 2

println("I have $numberOfDogs dogs"+" and $numberOfCats cats")
//I have 3 dogs and 2 cats


//PLANTILLAS DE CADENAS
val i = 10 
println("i = $i") //i = 10

val s = "abc"
println("$s.longitud is ${s.lenght}") //abc.longitud is 3


//EXPRESIONES DE PLANTAILLA DE CADENA
val numberOfShirts = 10
val numberOfPants = 5
println("I have ${numberOfShirts + numberOfPants} items of clothing")
//I have 15 items of clothing


//VARIABLES

/*
    Kotlin es un lenguaje de tipado estático. El tipo se resuleve en 
    tiempo de compilación y nunca cambia
    -- el compilador infiere en el tipo de variable
    -- se clasifican en variables mutables e inmutables

    */

//ESPECIFICANDO EL TIPO DE VARIABLE

var width: Int = 12
var length: Double = 2.5 //No se puede cambiar el tipo de variable

//VARIABLES MUTABLES E INMUTABLES
//Mutable(Changeable)
var score = 10

//Immmutable (Unchangeable) se recomienda mas este tipo 
val name = "Jennifer"

//var puede cambiar su valor, el val no 
var count = 1
count = 2

val size = 1 
size = 2
// error: val canot be reasigned


//LISTAS Y ARRAYS
/*
    LISTAS
        - Las listas son colecciones ordenadas de elementos
        - Se puede acceder a los elementos de la lista mediante programación 
          a traves de la manipulación de sus índices
        - Los elementos pueden aparecer mas de una vez en una lista   
    
    */

    //LISTA INMUTABLE USANDO listOf() (IMMMUTABLE LIST USING LISTOF())
        val instruments = listOf("trumpet","piano","violin")
        prinln(instruments)
        //[trumpet,piano,violin]

    //LISTA MUTABLE USANDO mutableListOf() (MUTABLE LIST USING MUTABLELISTOF())
        val mylist = mutableListOf("trumpet","piano","violin")
        myList.remove("violin")//puede cambiar los valores de la lista
        //[trumpet,piano]
    

/*
    ARRAYS
        - Los Arrays almacenan varios elementos 
        - Se puede acceder a los elementso del array mediante programación a 
          través de sus índices
        - Los elementos del array son mutables
        - El tamaño del array es fijo
    */

    //ARRAY USANDO arrayOf()
        val pets = arrayOf("dog","cat","canary")
        prinln(java.util.Arrays.toString(pets))
        //[dog,cat,canary]

    //ARRAYS CON TIPOS MIXTOS O SIMPLES
        val mix = arrayOf("hats",2) //diferentes tipos
        val numbers = intArrayOf(1,2,3) //solo enteros
    
    //COMBINANDO ARRAYS ( + )
        val numbers = intArrayOf(1,2,3)
        val numbers2 = intArrayOf(4,5,6)
        val combined = numbers2 + numbers
        println(Arrays.toString(combined))
        //[4,5,6,1,2,3]

//NULL SAFETY
/*
    Las variables no pueden ser nulas de forma prederterminada
    explicitamente.

    Asignar explícitamente una variable a nulo utilizando el operador
    de llamada segura.

    Permita excepciones de puntero nulo usando el !! operador

    Puede probar nulo usando el operador elvis ( ?: )

*/

    var numberOfBooks: Int = NULL
    // error: null can not be a value of a non-null type Int

    //OPERADOR DE LLAMDA SEGURA (Safe call operator)
        var numberOfBooks: Int? = null

    //PRUEBA PARA NULO (Testing for null)
        var numberOfBooks = 6
        if(numberOfBooks !=null){
            numberOfBooks = numberOfBooks.dec()

        }

        //Otra forma 
            var numberOfBooks = 6
            numberOfBooks = numberOfBooks?.dec()
    
    //OPERADOR !!
    /*
        Si estamos seguros de que una variable no será nula,
        usar !! para forzar la varaible a un tipo nulo
        Entonces puedes llamar a métodos/propiedades en él.
    
        */

        val len = s!!.length
        //al poner !! estoiy asegurand que la vraible no "s" no puede ser nula
    
    //OPERADOR ELVIS
    /*
        Cadena de pruebas nulas con el operador ?:
        lo que sucede es que si obtenemos un valor nulo
        con el operador elvis no s garantiza que el resultado
        saldrá 0 como se indica en el codigo siguiente
        */

        numberOfBooks = numberOfBooks?.dec() ?: 0

//CONDICIONALES

/*
    Flujos de control 
    Kotlin presenta varias formas de implemetar la lógica
    condicional:

    - If/Else statements
    - When Statements
    - For loops 
    - While loops

    */

    // if/ else STATEMENTS

        val numberOfCups = 30
        val numberOfPlates = 50

        if(numberOfCups > numberOfPlates){
            println("Too many cups")
        }else{
            prinln("Not enough cups")
        }


    //RANGOS

    //Sintaxis: valorInicial..valorFinal

        val numberOfStudents = 50
        if(numberOfStudents in 1..100){
            println(numberOfStudents)
        } //50

    //when statement

        when (results){
            0 -> println("No results")
            in 1..39 -> println("Got results")
            else -> println("That's a lot of results!")

        }

    //for loops

        val pets = arrayOf("dog","cat","canary")
        for(element in pets){
            print(element + " ")
        }

//FUNCIONES
    fun printHello(){
        println("Hello world")
    }
    printHello()

    //UNIT : devuelve un único valor
        fun printHello(name: string?): Unit{
            println("Hi there!")
        }

        // que es equivalente a:
            fun printHello(name: string?){
                println("Hi there!")
            }
    

    //ARGUMENTOS CON FUNCIONES
    /*
        Las funciones pueden tener:
        - Parámetros por defecto
        - Parámetros obligatorios
        - Parámetros con nombre

        */

        //PARAMETROS POR DEFECTO
        
            fun drive(speed: string ="fast"){
                println("driving $speed")
            }
        
            drive() //driving fast
            drive("slow") //driving slow
            drive(speed = "turtle-like") //driving turtle-like

        //PARAMETRSO OBLIGATORIOS
            fun tempToday(day: string, temp: Int){
                println("Today is $day and it's $temp degrees")
            }
        
        //PUEDE HABER PARAMETROS OBLIGATORIOS Y PREDETRIMNADOS EN UNA FUNCIÓN
            fun reformat(str: String, divideByCamelHumps:Boolean, wordSeparator: Char, normalizeCase: Boolean = true){

            }
            reformat("Hola",false,'-')

        //ARGUMENTOS CON NOMBRES
            reformat(str="hola", divideByCamelHumps = false , wordSeparator='-')

//FUNCIONES COMPACTAS O DE EXPRESIÓN ÚNICA

    fun double(x:Int):Int{ //normal version
         x*2
    }
        

    fun double(x:Int):Int = x * 2 //compact version

//FUNCIONES LAMBDAS

    //1°Forma
    var dirlevel = 20
    val waterfilter = {
        level: Int -> level / 2
    }
    println(waterFilter(dirtLevel))

    //2°Forma "tipo de datos "
    val waterFilter: (Int) -> Int = { 
        level -> level / 2 
    }

    val treat: () -> Unit = {
        println("Have a treat!")
    }


//FUNCIONES DE ORDEN SUPERIOR
/*
    Las funciones de orden superior toman funciones como parámetrso o devuelven una función
    */
    
    fun encodeMsg(msg: String, encode: (String) -> String):String{
        return encode(msg)
    }

    val enc1: (String) -> String = {input -> input.toUpperCase() }
    println(encodeMsg("abc",enc1("h")))

    




    
    

            


        
        




