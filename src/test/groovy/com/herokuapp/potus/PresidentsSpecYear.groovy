package com.herokuapp.potus

import geb.spock.GebReportingSpec

class PresidentsSpecYear extends GebReportingSpec {


    def "Test Should be able to search by first name or last name, Searching for Abraham should display Abraham Lincoln but searching for Bush should display both George Bush and George W. Bush"() {
        when:
        to IndexPage

        then:
        at IndexPage
        $("a[href='/search-by-year']").click()



        when:
        $('#year').click()
        $('#year').find("option").find{ it.value() == "2000" }.click()

        then:
        def uiPresident = $("#presidents")
        println "Complete"
        Thread.sleep(1000)

        when:
        $('#year').click()
        $('#year').find("option").find{ it.value() == "2015" }.click()

        then:
        println "Complete"
        Thread.sleep(1000)

        when:
        $('#year').click()
        $('#year').find("option").find{ it.value() == "1789" }.click()

        then:
        println "Complete"
        Thread.sleep(1000)
    }

}