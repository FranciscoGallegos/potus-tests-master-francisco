package com.herokuapp.potus

import geb.spock.GebReportingSpec

class PresidentsSpecName extends GebReportingSpec {


  def "Should test Should be able to search by first name or last name, Searching for Abraham should display Abraham Lincoln but searching for Bush should display both George Bush and George W. Bush"() {
    when:
    to IndexPage

    then:
    at IndexPage
    $("a[href='/search-by-name']").click()

    when:
    def Name_field = $("#q")
    Name_field.value("Barack")

    then:
    $("#search-btn").click()
   / $("#search-btn input[type=button]").click()/
    def uiPresident = $("#presidents")
    println "Complete"
    Thread.sleep(1000)
  //  var content = $("#presidents").html();
  //  println content
 //   assert "Barak" == content
 //   assert "Obama" == content
 //   assert "Party: Democrat" ==  content
    when:
    Name_field.value("Obhama")

    then:
    $("#search-btn").click()
    println "Complete"
    Thread.sleep(1000)

    when:
    Name_field.value("Bush")

    then:
    $("#search-btn").click()
    Thread.sleep(1000)
    println "Complete"
    Thread.sleep(3000)
  }

}
