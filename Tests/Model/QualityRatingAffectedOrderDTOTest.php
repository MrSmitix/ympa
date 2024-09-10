<?php
/**
 * QualityRatingAffectedOrderDTOTest
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

use OpenAPI\Server\Model\QualityRatingAffectedOrderDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * QualityRatingAffectedOrderDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Информация о заказе, который повлиял на индекс качества.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\QualityRatingAffectedOrderDTO
 */
class QualityRatingAffectedOrderDTOTest extends TestCase
{
    protected QualityRatingAffectedOrderDTO|MockObject $object;

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
        $this->object = $this->getMockBuilder(QualityRatingAffectedOrderDTO::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(QualityRatingAffectedOrderDTO::class));
        $this->assertInstanceOf(QualityRatingAffectedOrderDTO::class, $this->object);
    }

    /**
     * Test attribute "orderId"
     *
     * @group unit
     * @small
     */
    public function testPropertyOrderId(): void
    {
        $this->markTestSkipped('Test for property orderId not implemented');
    }

    /**
     * Test attribute "description"
     *
     * @group unit
     * @small
     */
    public function testPropertyDescription(): void
    {
        $this->markTestSkipped('Test for property description not implemented');
    }

    /**
     * Test attribute "componentType"
     *
     * @group unit
     * @small
     */
    public function testPropertyComponentType(): void
    {
        $this->markTestSkipped('Test for property componentType not implemented');
    }
}
