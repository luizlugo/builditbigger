# Build It bigger

Build it bigger is an android application that let you see the funniest jokes that exists

### Installation

Build it bigger requires [Android studio](https://developer.android.com/studio) v3.5+ to run.

Clone this repository and import into Android studio

```sh
$ git clone https://github.com/luizlugo/builditbigger.git
```

### Libraries

Urmovie is currently extended with the following libraries. Instructions on how to use them in your own application are linked below.

| Library | README |
| ------ | ------ |
| Google play services | https://developers.google.com/android/guides/setup |
| Google Api client | https://developers.google.com/api-client-library/java |
| Google Http client android | https://github.com/googleapis/google-http-java-client |

### Configuration
In order to be able to run the free version of the app you have to generate an AdMob app Id following the next website https://developers.google.com/admob/android/quick-start

Once you have your key you have to add it to the ``AndroidManifest.java`` which is into the following location ``app/src/free/``, look for the following meta-data tag:

```sh
<meta-data
      android:name="com.google.android.gms.ads.APPLICATION_ID"
      android:value="[APPLICATION_ID_HERE]" />
```

### Todos

 - Write unit tests

License
----

MIT


**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
