/**
 * User: emil
 * Date: 2014-01-22
 * Time: 12:33
 */
class FileHashCalculatorTest extends GroovyTestCase {
    void testCalculateHash() {
        assertEquals("e8481b43b3b0deb16378fabcd211f6be176a4feb30808459", FileHashCalculator.calculateHash('twd-106.cbr'))
    }
}
