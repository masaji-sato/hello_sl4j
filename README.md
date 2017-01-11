# 参考ページ

- https://springframework.guru/using-logback-spring-boot/
- http://www.slideshare.net/miyakawataku/concepts-and-tools-of-logging-in-java

## logback-spring.xmlで設定を記述

springProfile要素のname属性で起動時のVM optionsでactiveにできる。

### 例 devの設定を使用する
-Dspring.profiles.active=dev

