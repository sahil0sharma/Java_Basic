package Practice.file3.Inheritance;

//Reference in Java
//Java me object aur reference alag cheez hai.
//Object = memory me real instance (data + methods).
//Reference = ek variable jo us object ka address hold karta hai.
//        👉 Matlab reference lene = ek variable banana jo object ko point kare.
// runtime pe JVM object check karte hai to new class7() is creating object so this will run

// Parent class
class Class6 {
    public void text1() {
        System.out.println("method1");
    }
    public void text2() {
        System.out.println("method21");
    }
}

// Child class
class Class7 extends Class6 {
    // Overriding method
    @Override
    public void text2() {
        // Agar parent ka bhi call karna ho to super use kar
        super.text2();
        System.out.println("method2");
    }

    // Extra method (only in child)
    public void text3() {
        System.out.println("method3");
    }
}

// Main class
public class methoddispatch {
    public static void main(String[] args) {
        // Reference = parent, Object = child
        Class6 two = new Class7();

        // Runtime polymorphism: child ka text2() chalega
        two.text2();   // Output: method21
        //         method2

        // Accessing child-only method by casting
        ((Class7) two).text3();   // Output: method3
    }
}


//class6 two
//→ yeh ek reference variable hai jo type class6 ka hai.
//Matlab compiler kahega: “iske through tum sirf class6 me declared methods ko hi access kar paoge.”
//
//new class7()
//→ yeh ek object ban gaya jo class7 ka hai.
//Matlab actual object child class ka hai.
//
//class6 two = new class7();
//→ ab two reference parent type ka hai, lekin point kar raha hai child object ko.
// (Isse hi kehte hain dynamic method dispatch ya runtime polymorphism.)
//
//two.text2();
//→ Compiler dekhega: "text2() method parent (class6) me hai, toh call valid hai."
//Lekin runtime pe JVM object dekh lega:
//
//object → class7 ka hai,
//toh class7 ka text2() chalega.
//
// super.text2(); inside class7
//→ matlab class7.text2() ke andar jab tu super.text2() likhta hai,
//toh pehle parent (class6) ka method call hoga → "method21"
//phir apna wala → "method2"