<?php
/**
 * OrdersStatsPaymentDTOTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\OrdersStatsPaymentDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * OrdersStatsPaymentDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Информация о денежных переводах по заказу.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\OrdersStatsPaymentDTO
 */
class OrdersStatsPaymentDTOTest extends TestCase
{
    protected OrdersStatsPaymentDTO|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(OrdersStatsPaymentDTO::class)->getMockForAbstractClass();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(OrdersStatsPaymentDTO::class));
        $this->assertInstanceOf(OrdersStatsPaymentDTO::class, $this->object);
    }

    /**
     * Test attribute "id"
     *
     * @group unit
     * @small
     */
    public function testPropertyId(): void
    {
        $this->markTestSkipped('Test for property id not implemented');
    }

    /**
     * Test attribute "date"
     *
     * @group unit
     * @small
     */
    public function testPropertyDate(): void
    {
        $this->markTestSkipped('Test for property date not implemented');
    }

    /**
     * Test attribute "type"
     *
     * @group unit
     * @small
     */
    public function testPropertyType(): void
    {
        $this->markTestSkipped('Test for property type not implemented');
    }

    /**
     * Test attribute "source"
     *
     * @group unit
     * @small
     */
    public function testPropertySource(): void
    {
        $this->markTestSkipped('Test for property source not implemented');
    }

    /**
     * Test attribute "total"
     *
     * @group unit
     * @small
     */
    public function testPropertyTotal(): void
    {
        $this->markTestSkipped('Test for property total not implemented');
    }

    /**
     * Test attribute "paymentOrder"
     *
     * @group unit
     * @small
     */
    public function testPropertyPaymentOrder(): void
    {
        $this->markTestSkipped('Test for property paymentOrder not implemented');
    }
}
