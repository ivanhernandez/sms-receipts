
# sms-receipts

An easy Clojure app, easily deployable to Heroku, for accumulating SMS server notifications.

This application is based on [Getting Started with Clojure](https://devcenter.heroku.com/articles/getting-started-with-clojure) article - check it out.

## Running Locally

Make sure you have Clojure installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/ivanhernandez/sms-receipts.git
$ cd sms-receipts
$ lein repl
```
```clojure
user=>(require 'sms-receipts.web)
user=>(def server (sms-receipts.web/-main))
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Clojure on Heroku, see these Dev Center articles:

- [Clojure on Heroku](https://devcenter.heroku.com/categories/clojure)

