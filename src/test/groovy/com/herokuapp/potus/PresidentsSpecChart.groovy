package com.herokuapp.potus

import geb.spock.GebReportingSpec

class PresidentsSpecChart extends GebReportingSpec {


    def "Test Should show a large pie chart depicting the party each president served under"() {
        when:
        to IndexPage

        then:
        at IndexPage
        $("a[href='/parties']").click()
        println "Complete"
        Thread.sleep(1000)

    }

}