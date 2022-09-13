# kursat-kumsuz-odev2

*  `MVVM` for Architecture
*  `Room` for Database
*  `Lottie` for Animation
## 📸 Activity Transition
<p align="center">
<img src="https://media.giphy.com/media/gSLfzTi3Qqg6WGvoqJ/giphy.gif">
 </p>
 
 ## 📸 Sign Up Activity
 EditText'lerin boş olup olmadığı kontrol edilir. Eğer boş ise hata mesajı verilir. Tüm bilgiler girildikten sonra Sign Up butonuna tıklanıldığında bilgiler Room database'e kaydedilir.
<p align="center">
<img src="https://media.giphy.com/media/sIL680Vo3IeKrtSsdF/giphy.gif">
 </p>
 
 ## 📸 Login Activity
 EditText'lerin boş olup olmadığı kontrol edilerek boş ise hata mesajı verilir. Girilen bilgiler database ile eşleşmezse Toast mesajı gösterilerek girilen bilgilerde hata olduğu ifade edilir. Eğer girilen bilgiler database ile eşleşirse girişin başarılı olduğuna dair DialogFragment gösterilir.
<p align="center">
<img src="https://media.giphy.com/media/D0nPezi9VuAzfuMEhR/giphy.gif">
 </p>
 
 # Eager vs Lazy filters 
`Lazy` (tembel) filter’lar filtreleme , transformasyon ve gruplama gibi işlemleri terminal tipinde bir operasyon çağrıldığında yapar.  `count()`, `toList()` ve `toSet()` Terminal tipinde operasyonlardan bazılarına örnektir. Bunlara `Sequences` denir. Öte yandan `Eager` filter’lara bakacak olursak operasyonun her adımında sonucu döndürdüğünü yani istekli bir tutum sergilediğini ifade etmek mümkündür. `Lazy` ve `Eager` arasındaki en temeldeki fark performanstır. `Lazy` , `Eager`’a göre yukarıda da açıklandığı üzere tembel bir şekilde operasyonları gerçekleştirdiği için performans olarak daha verimlidir.
 
 
 
 
