# XML Namespace Nedir?

Namespace’ler en temelde bir XML dosyasında benzersiz olarak adlandırılmış elemanlar ve attribute'lar yani öznitelikler sağlamak için kullanılmaktadırlar. 
Böylelikle XML dosyasında olası bir çakışmanın önüne geçilmektedir.

```
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
```

Yukarıda verilen örnekte de görüleceği üzere proje oluşturulduğunda karşımıza gelen `activity_main.xml` sayfasında bazı namespace’ler görülmektedir. Bir XML namespace’i iki özniteliği bünyesinde bulundurmalıdır. Bunlardan biri Prefix diğeri ise URI’dır.

`xmlns:` Extensible Markup Language Namespace ifadesinin kısaltmasıdır.
`android=` Prefix ,
`"http://schemas.android.com/apk/res/android"` ise URI (Uniform Resource Identifier) kısmıdır.

Örnekten de anlaşıldığı üzere Android Studio içerisinde bir aktivite oluşturulduğunda `android` ve `tools` adındaki iki namespace default olarak karşımıza gelmektedir. 

```
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        tools:text="Patika FMSS Bilişim Bootcamp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

`android` ve `tools` namespace’lerinin farkını anlatmak için TextView’ı örnek olarak seçtim. TextView’a bir text eklemek istediğimizde `android` değil de `tools` namespace’ini tercih edersek text yalnızca `xml` dosyamızdaki tasarım ekranında görünecektir. Uygulamamızı emülatörde çalıştırdığımızda bu text görünmeyecektir. `Android` namespace’in kullanıldığı senaryoyu ele alırsak bu defa text  emülatörde de görünecektir.Bir başka ifadeyle text değerinin sabit kalması istenildiği durumlarda `android` , istenilmediği durumlarda `tools` namespace'i kullanılmaldır.


Netice itibariyle verilen örneklerden yola çıkılırsa `tools` namespace'i ile yapılan değişiklikler yalnızca tasarım ekranında görünürken `android` namespace'i ile yapılan değişiklikler emülatörde de görünür şeklinde çıkarım yapmak mümkün hale gelecektir. 


