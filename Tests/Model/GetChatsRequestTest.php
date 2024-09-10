<?php
/**
 * GetChatsRequestTest
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

use OpenAPI\Server\Model\GetChatsRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * GetChatsRequestTest Class Doc Comment
 *
 * @category    Class
 * @description Фильтры по чатам, которые нужно вернуть.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\GetChatsRequest
 */
class GetChatsRequestTest extends TestCase
{
    protected GetChatsRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(GetChatsRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(GetChatsRequest::class));
        $this->assertInstanceOf(GetChatsRequest::class, $this->object);
    }

    /**
     * Test attribute "orderIds"
     *
     * @group unit
     * @small
     */
    public function testPropertyOrderIds(): void
    {
        $this->markTestSkipped('Test for property orderIds not implemented');
    }

    /**
     * Test attribute "types"
     *
     * @group unit
     * @small
     */
    public function testPropertyTypes(): void
    {
        $this->markTestSkipped('Test for property types not implemented');
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
}
