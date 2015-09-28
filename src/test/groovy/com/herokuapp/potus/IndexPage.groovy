package com.herokuapp.potus

import geb.Page

class IndexPage extends Page {
  static url = '/'

  static at = {
    title == 'Welcome: Mercury Tours'
  }

  static content = {
    navigation { module NavigationModule, $('#navigation', 0) }
  }
}
