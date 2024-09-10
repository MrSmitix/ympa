<?php
/**
 * OrderBusinessDocumentsDTOTest
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

use OpenAPI\Server\Model\OrderBusinessDocumentsDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * OrderBusinessDocumentsDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Информация о документах.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\OrderBusinessDocumentsDTO
 */
class OrderBusinessDocumentsDTOTest extends TestCase
{
    protected OrderBusinessDocumentsDTO|MockObject $object;

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
        $this->object = $this->getMockBuilder(OrderBusinessDocumentsDTO::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(OrderBusinessDocumentsDTO::class));
        $this->assertInstanceOf(OrderBusinessDocumentsDTO::class, $this->object);
    }

    /**
     * Test attribute "upd"
     *
     * @group unit
     * @small
     */
    public function testPropertyUpd(): void
    {
        $this->markTestSkipped('Test for property upd not implemented');
    }

    /**
     * Test attribute "ukd"
     *
     * @group unit
     * @small
     */
    public function testPropertyUkd(): void
    {
        $this->markTestSkipped('Test for property ukd not implemented');
    }

    /**
     * Test attribute "torgTwelve"
     *
     * @group unit
     * @small
     */
    public function testPropertyTorgTwelve(): void
    {
        $this->markTestSkipped('Test for property torgTwelve not implemented');
    }

    /**
     * Test attribute "sf"
     *
     * @group unit
     * @small
     */
    public function testPropertySf(): void
    {
        $this->markTestSkipped('Test for property sf not implemented');
    }

    /**
     * Test attribute "ksf"
     *
     * @group unit
     * @small
     */
    public function testPropertyKsf(): void
    {
        $this->markTestSkipped('Test for property ksf not implemented');
    }
}
