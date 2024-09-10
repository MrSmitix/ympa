//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for ContentApi
void main() {
  // final instance = ContentApi();

  group('tests for ContentApi', () {
    // Списки характеристик товаров по категориям
    //
    // Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
    //
    //Future<GetCategoryContentParametersResponse> getCategoryContentParameters(int categoryId) async
    test('test getCategoryContentParameters', () async {
      // TODO
    });

    // Получение информации о заполненности карточек магазина
    //
    // Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
    //
    //Future<GetOfferCardsContentStatusResponse> getOfferCardsContentStatus(int businessId, { String pageToken, int limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest }) async
    test('test getOfferCardsContentStatus', () async {
      // TODO
    });

    // Редактирование категорийных характеристик товара
    //
    // Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    //
    //Future<UpdateOfferContentResponse> updateOfferContent(int businessId, UpdateOfferContentRequest updateOfferContentRequest) async
    test('test updateOfferContent', () async {
      // TODO
    });

  });
}
