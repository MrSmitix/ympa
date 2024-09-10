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

// tests for FullOutletLicenseDTO
void main() {
  // final instance = FullOutletLicenseDTO();

  group('test FullOutletLicenseDTO', () {
    // Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Идентификатор точки продаж, для которой действительна лицензия.
    // int outletId
    test('to test the property `outletId`', () async {
      // TODO
    });

    // LicenseType licenseType
    test('to test the property `licenseType`', () async {
      // TODO
    });

    // Номер лицензии.
    // String number
    test('to test the property `number`', () async {
      // TODO
    });

    // Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
    // DateTime dateOfIssue
    test('to test the property `dateOfIssue`', () async {
      // TODO
    });

    // Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
    // DateTime dateOfExpiry
    test('to test the property `dateOfExpiry`', () async {
      // TODO
    });

    // LicenseCheckStatusType checkStatus
    test('to test the property `checkStatus`', () async {
      // TODO
    });

    // Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. 
    // String checkComment
    test('to test the property `checkComment`', () async {
      // TODO
    });


  });

}
