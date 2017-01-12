# sl4jを試してみる

SPRING INITIALIZR（http://start.spring.io/）で、"Web"と"Thymeleaf"のみをチェックしてダウンロード。
依存ライブラリをみると、すでにslf4jが含まれていることが確認できる。Spring bootはデフォルトでslf4jが使用可能ということ。

## 参考ページ

- https://springframework.guru/using-logback-spring-boot/
- http://www.slideshare.net/miyakawataku/concepts-and-tools-of-logging-in-java

## 気になるワードとリンク

### ワード

- Marker
- MDC
- フィルター

### リンク

- http://stackoverflow.com/questions/16813032/what-is-markers-in-java-logging-frameworks-and-that-is-a-reason-to-use-them
- https://hondou.homedns.org/pukiwiki/pukiwiki.php?JavaSE%20SLF4J%2FMarker%2CMDC
- http://stackoverflow.com/questions/16813032/what-is-markers-in-java-logging-frameworks-and-that-is-a-reason-to-use-them
- http://d.hatena.ne.jp/taichitaichi/20090220/1235124140
- http://logback.qos.ch/manual/filters_ja.html
- http://shitstorm.hatenablog.jp/entry/2015/04/03/220051

## logback-spring.xmlで設定を記述

springProfile要素のname属性で起動時のVM optionsでactiveにできる。

### 例 devの設定を使用する
-Dspring.profiles.active=dev

