# _Java102 Programme_

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
