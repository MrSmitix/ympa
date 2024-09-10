<?php
/**
 * GetOrdersStatsRequestTest
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

use OpenAPI\Server\Model\GetOrdersStatsRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * GetOrdersStatsRequestTest Class Doc Comment
 *
 * @category    Class
 * @description Запрос информации по заказам.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\GetOrdersStatsRequest
 */
class GetOrdersStatsRequestTest extends TestCase
{
    protected GetOrdersStatsRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(GetOrdersStatsRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(GetOrdersStatsRequest::class));
        $this->assertInstanceOf(GetOrdersStatsRequest::class, $this->object);
    }

    /**
     * Test attribute "dateFrom"
     *
     * @group unit
     * @small
     */
    public function testPropertyDateFrom(): void
    {
        $this->markTestSkipped('Test for property dateFrom not implemented');
    }

    /**
     * Test attribute "dateTo"
     *
     * @group unit
     * @small
     */
    public function testPropertyDateTo(): void
    {
        $this->markTestSkipped('Test for property dateTo not implemented');
    }

    /**
     * Test attribute "updateFrom"
     *
     * @group unit
     * @small
     */
    public function testPropertyUpdateFrom(): void
    {
        $this->markTestSkipped('Test for property updateFrom not implemented');
    }

    /**
     * Test attribute "updateTo"
     *
     * @group unit
     * @small
     */
    public function testPropertyUpdateTo(): void
    {
        $this->markTestSkipped('Test for property updateTo not implemented');
    }

    /**
     * Test attribute "orders"
     *
     * @group unit
     * @small
     */
    public function testPropertyOrders(): void
    {
        $this->markTestSkipped('Test for property orders not implemented');
    }

    /**
     * Test attribute "statuses"
     *
     * @group unit
     * @small
     */
    public function testPropertyStatuses(): void
    {
        $this->markTestSkipped('Test for property statuses not implemented');
    }

    /**
     * Test attribute "hasCis"
     *
     * @group unit
     * @small
     */
    public function testPropertyHasCis(): void
    {
        $this->markTestSkipped('Test for property hasCis not implemented');
    }
}
