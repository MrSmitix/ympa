<?php
/**
 * SkipGoodsFeedbackReactionRequestTest
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

use OpenAPI\Server\Model\SkipGoodsFeedbackReactionRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * SkipGoodsFeedbackReactionRequestTest Class Doc Comment
 *
 * @category    Class
 * @description Идентификаторы отзывов.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\SkipGoodsFeedbackReactionRequest
 */
class SkipGoodsFeedbackReactionRequestTest extends TestCase
{
    protected SkipGoodsFeedbackReactionRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(SkipGoodsFeedbackReactionRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(SkipGoodsFeedbackReactionRequest::class));
        $this->assertInstanceOf(SkipGoodsFeedbackReactionRequest::class, $this->object);
    }

    /**
     * Test attribute "feedbackIds"
     *
     * @group unit
     * @small
     */
    public function testPropertyFeedbackIds(): void
    {
        $this->markTestSkipped('Test for property feedbackIds not implemented');
    }
}
