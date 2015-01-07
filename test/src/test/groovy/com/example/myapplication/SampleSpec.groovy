package com.example.myapplication

import android.content.Context

import org.robolectric.Robolectric

import pl.polidea.robospock.RoboSpecification

class SampleSpec extends RoboSpecification {

    def "sample"() {
        when:
        Context context = Robolectric.getShadowApplication().getApplicationContext();

        then:
        context.getText(R.string.app_name) == "My Application"

    }
}