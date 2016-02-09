#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import spock.lang.Specification
import spock.lang.Unroll

/**
 * An example of a Spock BDD Specification
 */
class ExampleSpec extends Specification {
    def example = new Example();

    /**
     * A test which ensures that adding 2 values produces the correct result
     */
    def "adding 2 integers should work"() {
        given: "a=10 and b=12"
        def a = 10
        def b = 12

        when: "${symbol_pound}a and ${symbol_pound}b are added"
        def result = example.add(a, b)

        then: "The result MUST be 22"
        result == 22
    }

    /**
     * A test which tests the {@link Example${symbol_pound}add(int, int)} method with various values and results using a
     * data table
     * @param a The first addend
     * @param b The second addend
     * @param c The SUM of {@code a} AND {@code b}
     */
    @Unroll
    def "Adding ${symbol_pound}a to ${symbol_pound}b should always return ${symbol_pound}c"(int a, int b, int c) {
        given: "a = ${symbol_pound}a, b = ${symbol_pound}b, and c = ${symbol_pound}c"

        when: "a(${symbol_pound}a) is added to b(${symbol_pound}b)"
        def result = example.add(a, b)

        then: "The result must be c(${symbol_pound}c)"
        result == c

        where:
        a | b  || c
        1 | 2  || 3
        2 | 4  || 6
        12| 13 || 25
    }

    @Unroll
    def "Adding non-integers should fail"() {
        given: "a = ${symbol_pound}a, b = ${symbol_pound}b, and c = ${symbol_pound}c"

        when: "a(${symbol_pound}a) is added to b(${symbol_pound}b)"
        def result = example.add(a, b)

        then: "An error must occur"
        def e = thrown(MissingMethodException)

        where:
        a   | b    || c
        1.1 | 2.1  || 3.2
        1   | 2.1  || 3.1
        2   | 1.1  || 3.1
    }
}
