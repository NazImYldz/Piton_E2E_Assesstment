# Piton_E2E_Assesstment
* Test yapısı Page Object Model formatında hazırlanmıştır.
* Test edilmesi istenen üç modül ayrı olarak düzenlenmiş ve üç modül için feature dosyaları hazırlanmıştır.
* BDD konsepti ile hazırlanan test adımlarının, test durumlarına uygun ve daha anlaşılır olması amaçlanmıştır.
* "/src/test/resources/features/" klasörü altındaki dosyalarda test adımları anlaşılır bir şekilde oluşturulmuştur.
* "/src/test/java/stepDefinitions/" klasörü altında testi gerçekleştirmek için gerekli sınıflar "feaure" dosyaları ile uyumlu şekilde oluşturulmuştur.
* "/src/test/java/pages/" klasörü altında bulunan sınıflarda, site üzerindeki test işlemleri için gerekli Web elemanları tanımlanmıştır.
* "/src/test/java/utilities/" klasörü altındaki sınıflarda, test işlemlerinde kolaylık sağlaması için hazırlanmış kod yapıları bulunmaktadır.
* "/src/test/java/hook/" klasörü altında, başarısız olan test durumlarında ekran görüntüsü alınmasını sağlayan kod yapısı bulunmaktadır.
* Test sonuçlarının raporları, "test-output" klasörü altında, her test sonrası otomatik olarak oluşturulan "PdfReport" klasöründe bulunmaktadır.
* "/src/test/java/runners/" klasörü altında, testlerin koşulmasını sağlayan sınıf bulunmaktadır.
* Her test durumu ve modül için tanımlanmış olan "tags" kullanılarak, tüm test durumları bir defada veya sadece istenilen test durumunun koşulması sağlanmaktadır.
