<?php
/**
 * WarningPromoOfferUpdateDTOTest
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

use OpenAPI\Server\Model\WarningPromoOfferUpdateDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * WarningPromoOfferUpdateDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Описание предупреждения, которое появилось при добавлении товара.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\WarningPromoOfferUpdateDTO
 */
class WarningPromoOfferUpdateDTOTest extends TestCase
{
    protected WarningPromoOfferUpdateDTO|MockObject $object;

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
        $this->object = $this->getMockBuilder(WarningPromoOfferUpdateDTO::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(WarningPromoOfferUpdateDTO::class));
        $this->assertInstanceOf(WarningPromoOfferUpdateDTO::class, $this->object);
    }

    /**
     * Test attribute "offerId"
     *
     * @group unit
     * @small
     */
    public function testPropertyOfferId(): void
    {
        $this->markTestSkipped('Test for property offerId not implemented');
    }

    /**
     * Test attribute "warnings"
     *
     * @group unit
     * @small
     */
    public function testPropertyWarnings(): void
    {
        $this->markTestSkipped('Test for property warnings not implemented');
    }
}
