# _Java102 Programme_

<center>

![](https://www.currentschoolnews.com/wp-content/uploads/2020/03/Java-Debugging-Tips-881x441-1.jpg)

</center>

## Access Modifiers

<details> 
<summary> 
Click for details..
</summary>

#### Erişim Belirleyiciler (Access Modifiers)

Java'da bir sınıfa ait nitelik ve davranışlara ulaşabilmek için Erişim Belirleyiciler (Access Modifiers) kullanılır. Erişim belirleyiciler, değişken ,metot ve sınıfların önüne yazılır ve yazıldıkları konuların erişilebilecekleri alanları belirlerler. Java'da 3 adet Erişim Belirleyiciler vardır bunlar ; public , private ve protected.

#### _Private_ Erişim Belirleyici

Java'da private deyimi yazıldığı öğenin sadece ait olduğu sınıftan doğrudan erişilebilir olduğunu ve o sınıfın dışındaki kod parçacıklarından doğrudan erişilemeyeceğini tanımlar. Nesne Yönelimli Programlama'nın temel ilkelerinden olan Sarmalama ilkesi gereği, sınıf içindeki değişkenler sadece sınıf içinde doğrudan erişebilir olması gerekir. Bundan dolayı, genellikle değişkenler "private" olarak tanımlanır. Bazı zamanlarda ise sadece o sınıfta çağrılmasını istediğimiz değişkenler veya metotları da private olarak tanımlarız.

#### _Public_ Erişim Belirleyici

Java'da "public" deyimi , yazıldığı öğenin sadece olduğu sınıf için değil, diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar. Sınıflara ait nesnelerin ve diğer nesneler tarafından kullanılması istenilen metotlar için "Public Erişim Düzenleyicisi" kullanılır.

#### _Protected_ Erişim Belirleyici

Java'da "protected" deyimi , public ve private arasında kalan bir erişim düzenleyicidir. Protected ile tanımlanan öğeler, kendisi ile aynı package (paket) bulunan sınıflar tarafından doğrudan erişilir.

#### _Varsayılan_- Default

Eğer yazdığımız kodlarda herhangi bir öğenin önüne erişim düzenleyici yazmazsak, o öğenin erişimi ait olduğu paket ile sınırlandırılır. Aynı pakette bulunan başka bir sınıf içinden o öğeye erişilir.

![image](https://user-images.githubusercontent.com/49093196/167252127-3a5d22c6-9b49-487b-a6f2-2b93cfc72c14.png)

</details>

## Statics

<details>
<summary>
Click for details..
</summary>

#### Static Kullanımı

Java'da Static deyimi, sınıf değişkenlerini ve ya sınıf metotlarını tanımlarken kullanılır. Eğer bir sınıfa ait değişkenlerin başına "static" yazılırsa, o değişkenler artık sınıf değişkeni olurlar. Sınıf değişkeni olarak tanımlanan değişkenler, her nesne oluşturduğumuzda ayrı ayrı oluşmazlar. Sınıfa ait ne kadar nesne olursa olsun, sınıf değişkenleri 1 tanedir. Sınıfa ait herhangi bir nesne üzerinden bu değişkene ulaşılabilir. Sınıf değişkenlerinin bir diğer özelliği ise, ilgili sınıfa ait hiç nesne oluşturulmasa bile bellekte yer kaplarlar.

- Eğer sınıfa ait metotlardan bir yada birden fazlasının önüne "static" deyimi yazılırsa, o metotlar sınıf metodu olurlar. Sınıf metotlarının en önemli özelliği, ilgili sınıfa ait nesne oluşturmadan sınıf metodu çağırılabilir. Bir sınıf değişkeninin, henüz nesne oluşturulmasa da bellekte fiziksel olarak yer kapladığını söylemiştik. Bir sınıf metodunun ise nesne oluşturulmadan, sınıf adı üzerinden çağrılabildiğini belirttik. Bu durumda, nesne var olmadan çağrılabilecek olan sınıf metotları, nesne var olmadan bellekte var olamayan olgu değişkenlerine erişmesi olanaklı değildir. Benzer şekilde, nesne var olmadan bellekte var olan sınıf değişkenleri üzerinde işlem yapan yöntemlerin, nesne var olmadan çağrılabilmeleri gerekir.

**Static Kod Blokları**

> Sınıf değişkenlerinin ilk değerlerinin verilmesi için kurucu metotlar kullanabiliriz. Ancak sınıfa ait statik değişkenlerinin ilk değerlerini kurucu içinde vermeye çalışmak yanlış olabilir. Çünkü sınıf değişkenleri, hiç nesne oluşturulmamış olsa da kullanılabilmektedir. Sınıf değişkenleri ile ilgili olarak bir defaya özel olmak üzere işletilmesi istenen kod kesimleri static kod bloklarında kodlanabilir. Static kod blokları, sınıf belleğe yüklendiği anda işletilir. Böylece sınıf değişkenleri bellekte oluşturuldukları anda ilk değerlerini almış olurlar

</details>

## Final Keyword

<details>
<summary>
Click for details..
</summary>

#### Final Anahtar Sözcüğü ve Sabit Tanımlama

Java'da "final" deyimi, önüne yazıldığı öğenin değerini bir kez tanımlandıktan sonra değiştirilemeyeceğini söyler. Bu yüzden programımız içerisinde "sabit" tanımlamak için kullanılır.

Bir sabit değeri tanımlandıktan sonra değiştirilemeyeceği için, final ile tanımlanmış bir değişkenin "public" olmasında bir sorun olmayacaktır.

NOT : Sabit tanımlarken isimler büyük harflerle yazılır. Sabit adı birden fazla sözcükten oluşuyorsa, sözcükler altçizgi ( \_ ) ile birbirlerinden ayrılır. Örneğin en fazla kayıt sayısını ifade edecek sabitin adı şöyle verilebilir: PATIKA_DEV_JAVA_102

</details>

## Encapsulation

<details>

<summary> 
Click for details..</summary>

#### Encapsulation (Kapsülleme)

Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz. Bunu bir örnek ile anlamaya çalışalım.

> Kapsülleme ile kullanırken sınıf niteliklerini diğer tarafta rahatça kullanılmasın diye private erişim belirleyici kullandıktan sonra veri değişimlerini sağlamak için getter setter yapılarını kullanarak değer yönetimini güvenli bir şekilde yapabilmekteyiz.
> Örneğin;

```java
public class Student{
    private String name;
    public Student(){
    }

    public setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
```

</details>

## Relations of Class

<details>
<summary>Click for details..</summary>

##### Sınıflar Arası İlişkiler

Java ve Nesne Yönelimli Programlamada, sınıfların oluşturulması gerekmektedir. Sınıfların belirlenmesi ve sistemi dizayn ederken sınıflar arasında nasıl bir ilişki olacağını karar vermek gerekir. Bu sistem dizaynlarını güzel oluşturduğumuz taktirde iyi bir başlangıç yapmış olup yazacağımız kodun kalitesini arttırırız. Peki bu sınıflar arasındaki ilişkiler nelerdir ?

> Sınıflar arası oluşturulabilecek 3 temel ilişki vardır ; Bağımlılık (Dependency), Birleştirme (composition) , Kalıtım (inheritance)

#### Bağımlılık (_Dependency_) / “_uses a_” İlişkisi

Java'da Bağımlılık bir diğer adı ile "uses a" ilişkisi, eğer bir sınıfın metotlarından en az biri başka bir sınıfa ait bir parametre alıyorsa, parametre alan metoda ait sınıf diğeri sınıfa bağımlıdır ya da onu kullanır (uses) denir. Yazılan program da sınıflar arası bağımlılığı arttırmak, birlikte yönetilmesi gereken sınıf miktarının da artmasına sebep olur. Bu durumda programın yönetilebilirliği veya bakımı zorlaşacaktır. Bunun sebebi ise, bir sınıf içinde yapılacak herhangi bir değişiklik bağımlı olduğu sınıfları da etkileyecektir ve bakım yükü artacaktır.

#### Birleştirme (_Composition_) / "_has a_" İlişkisi

Java'da Birleştirme (Composition) ilişkisi , eğer bir sınıfın değişkenlerinden en az bir tanesi başka bir sınıf türünden ise, değişkene sahip olan sınıf diğer sınıfı içerir yani "has a" olarak adlandırılır.

#### Kalıtım (_Inheritance_) / "_is a_" İlişkisi

Java'da Kalıtım (Inheritance) ilişkisi, eğer bir sınıfa ait tüm nesneler aynı zamanda daha genel yapıdaki başka bir sınıfa aitse, o zaman bu iki sınıf arasında kalıtım ilişkisi vardır.

</details>

## Inheritance

<details>
<summary>
Click for details..
</summary>

**_Kalıtım (Inheritance)_**
Kalıtım, programlama ortamında da gerçek hayattaki tanımına benzer bir işi gerçekleştirir. Bir sınıfın başka bir sınıftan kalıtım yapması demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını kendisine alması demektir. Kalıtımı yapan sınıfa alt sınıf, kendisinden kalıtım yapılan sınıfa ata sınıf dersek, ata sınıfta tanımlı olan herşeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.

Eğer bir A sınıfın B sınıfından kalıtım yapması isteniyorsa, aşağıda ki şekilde tanımlanır.

```java
    public class A extends B {
     //
}
```

\***\*Kalıtım Türleri\*\***

1. Tek Yönlü Kalıtım (Single Inheritance)

   > Bir sınıfın başka bir sınıfı genişlettiği alt ve ata sınıf ilişkisini ifade eder.
   > ![image](https://user-images.githubusercontent.com/49093196/168011717-2e06f1db-cd26-4d4f-946f-a641da2c70eb.png)

2. Çoklu Kalıtım (Multiple Inheritance)
   > Bir sınıfın birden fazla sınıfı miras almasını ifade eder; bu, bir alt sınıfın iki ata sınıfa sahip olduğu anlamına gelir.
   > ![image](https://user-images.githubusercontent.com/49093196/168011854-849173a9-5c25-4b8d-bfa0-ea89fe10ac4e.png)

**Not** _: Java çoklu kalıtımı desteklemez. (Interface kullanılır)_

3. Çok Seviyeli Kalıtım (Multilevel Inheritance)

   > Bir sınıfa ait alt sınıfın başka sınıfları genişletmesine denir.
   > Bu örnekte , C sınıfı B sınıfını miras alır, B sınıfı ise A sınıfını miras alır. C sınıfı dolaylı yoldan A sınıfınıda miras almış olur.

4. Hiyerarşik Kalıtım (Hierarchical Inheritance)

   > Birden fazla sınıfın aynı sınıfı genişlettiği bir alt ve üst sınıf ilişkisini ifade eder.
   > ![image](https://user-images.githubusercontent.com/49093196/168012002-b18778f1-0af6-49a2-b8f0-a59f492aab4b.png)

5. Hibrit Kalıtım (Hybrid Inheritance)
   > Programda birden fazla kalıtım türünün kombinasyonuna denir. Örneğin, A ve B sınıfı, C sınıfını genişletir ve başka bir D sınıfı, A sınıfını genişletir, bu bir hibrit kalıtım örneğidir, çünkü bu, tek yönlü ve hiyerarşik kalıtımın bir birleşimidir.
   > ![image](https://user-images.githubusercontent.com/49093196/168012049-d1571ec5-75b5-464b-9793-756537afd466.png)

Extra Notes:

> ### Kalıtım'da Constructor Zinciri ve Super Anahtar Sözcüğü
>
> Bir sınıfa ait nesne oluşturulurken, o sınıfın bir kurucusunun işletildiğini, kurucunun çalışması tamamlandıktan sonra bellekte artık bir nesnenin oluştuğunu biliyoruz. Kurucuları da nesneleri ilk oluşturuldukları anda anlamlı durumlara taşıyabilmek için kullanıyoruz. Bu durumda, eğer nesnesi oluşturulacak sınıf başka bir sınıfın alt sınıfıysa, önce ataya ait içnesnesinin oluşturulması ve bu nesnenin niteliklerinin ilk değerlerinin verilmesi gerektiğini söyleyebiliriz.

> İçiçe nesnelerin oluşabilmesi için nesnelerin içten dışa doğru oluşması gerekir. İç-nesnenin oluşabilmesi için, nesnesi oluşturulacak sınıfa ait kurucu işletilmeye başladığı zaman ilk iş olarak ata sınıfa ait kurucu çağrılır. Eğer ata sınıf da başka bir sınıfın alt sınıfıysa, bu kez o sınıfın kurucusu çağrılır. Kurucu zinciri alt sınıftan ata sınıfa doğru bu şekilde ilerler. En üstte, kalıtım ağacının tepesindeki sınıfın kurucusunun çalışması sonlandıktan sonra sırası ile alt sınıfların kurucularının çalışması sonlanacaktır. Böylece içiçe nesneler sıra ile oluşturularak en son en dıştaki nesne oluşturulmuş olur ve kurucu zinciri tamamlanır.

> ### Super Kullanımı
>
> Eğer ata sınıfta varsayılan kurucu yoksa ve programcı alt sınıftaki kurucunun içinde ata sınıfın hangi kurucusunun çağrılacağını belirtmezse derleme hatası alınacaktır. Çünkü derleyici aksi belirtilmedikçe ata sınıfın varsayılan kurucusunu çağıran super() kodunu üretecektir. Ata sınıfın hangi kurucusunun çağrılacağı, super anahtar sözcüğü ile birlikte verilen parametrelere göre belirlenir. Nasıl ki new işleci ile birlikte kullandığımız parametreler hangi kurucunun çağrılacağını belirliyorsa, super anahtar sözcüğü ile birlikte kullanılan parametreler de aynı şekilde ata sınıfın hangi kurucusunun işletileceğini belirler.

</details>

## Method Override

<details><summary>Click for details..</summary>

#### Metot Overriding (Metod Ezme)

> Aynı isimde farklı parametre listesi (sayı, tür ya da sıraları farklı olan parametreler) ile birden fazla yöntem kodlanmasını Yöntemlerin Aşırı Yüklenmesi ( Method Overloading) olarak adlandırmıştık.

**Aşırı yükleme**, bir sınıfın içine ata sınıflarındaki protected ya da public tanımlanmış yöntemlerle aynı isimde ve farklı parametre listesine sahip yeni yöntemler yazılarak da gerçekleştirilebilir. Çünkü bu sınıf ata sınıfındaki yöntemleri kalıtımla alacaktır.

> Yöntem Geçersiz Kılma ise bir alt sınıfın içine doğrudan ya da dolaylı ata sınıflarından gelen bir (ya da daha fazla) yöntemin aynısının (aynı yöntem adı ve aynı parametre listesi) kodlanmasına verilen addır.</details>

## Polymorphism

<details>
<summary>Click for details..</summary>

#### Çok Biçimlilik (Polymorphism)

Çok biçimlilik aynı görevin veya işin farklı yollarla yapılabilmesini ifade eder. Nesne, aynı davranışı farklı formlar ve görünüşler ile yerine getirebilir.

Bunu yapabilmek için iki yöntem vardır.

**Overriding in Java (Ezme)**

**Overloading in Java (Aşırı yükleme)**

**_instanceof - polymorphism ilişkisi_**

Obje vereceğiz objenin hangi sınıftan olduğuna bakacağız

Alt sınıfı aynı zamanda Ebeveyn sınıfından miras alıyor. Bu yüzden superclass'la kıyaslanırsa inheritance olduğu için true döner.

> Bütün classlar objeden türüyor.(Object class)

Polymorphism kullanmazsak bütün nesneleri instanceof ile kontrol etmemiz gerekir.

Yeni bir sınıf üretirsek ve Hayvan sınıfından miras alırsa yine kontrol etmemiz gerekecek ama polymorphism bu iş yükünü azaltıyor.

```java
 // Temel Gösterim - example of instance
        Kedi kedi = new Kedi("Pamuk");

        if (kedi instanceof Kedi){
            System.out.println("Bu nesne Kedi sınıfından");
        }
```

</details>
