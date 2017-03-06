1.浅尝Retrofit,retrofit具有很好的封装性，不再需要手动去封装

2.它的关键方法运行在ainThread中M,不再需要通过handler去解决线程之间的同步问题

3.所有的api都可以统一管理

4.retrofit官网http://square.github.io/retrofit/

5.若能和Rxjava结合使用，则善莫大焉

    compile 'com.squareup.retrofit2:retrofit:2.2.0'
    
    compile 'com.squareup.retrofit2:converter-gson:2.2.0'
    
    compile 'io.reactivex.rxjava2:rxjava:2.0.6'
    
    compile 'io.reactivex.rxjava2:rxandroid:2.0.1'
    
    compile 'com.squareup.retrofit2:adapter-rxjava:2.2.0'
6.
