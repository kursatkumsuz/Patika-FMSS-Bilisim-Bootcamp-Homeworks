# Parcelable vs Serializable


Parcelable ve Serializable data taşımak için kullanılan yöntemler olarak karşımıza çıkmaktadırlar. Bu iki yöntem de temelde referans tiplerini parçalayıp Intent ile birlikte bir başka Activity’e taşımamıza olanak tanımaktadırlar. Seriazable uygulanması itibariyle Parcelable’a kıyasla büyük bir kolaylık sağlamaktadır. Fakat Google mühendisleri tarafından geliştirilen Parcelable Serializable’a kıyasla 10 kat daha hızlıdır. Buna karşın uygulanması daha zordur. Netice itibariyle kolay bir şekilde bu işlemi uygulaması istenildiği durumlarda Seriazable , hızlı bir data transferi gerçekleştirilmesi istenildiği durumlarda da Parcelable kullanımı tercih edilmektedir.
