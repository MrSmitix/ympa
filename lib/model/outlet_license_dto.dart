//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OutletLicenseDTO {
  /// Returns a new [OutletLicenseDTO] instance.
  OutletLicenseDTO({
    this.id,
    this.outletId,
    this.licenseType,
    this.number,
    this.dateOfIssue,
    this.dateOfExpiry,
  });

  /// Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Идентификатор точки продаж, для которой действительна лицензия.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? outletId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LicenseType? licenseType;

  /// Номер лицензии.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? number;

  /// Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateOfIssue;

  /// Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateOfExpiry;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OutletLicenseDTO &&
    other.id == id &&
    other.outletId == outletId &&
    other.licenseType == licenseType &&
    other.number == number &&
    other.dateOfIssue == dateOfIssue &&
    other.dateOfExpiry == dateOfExpiry;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (outletId == null ? 0 : outletId!.hashCode) +
    (licenseType == null ? 0 : licenseType!.hashCode) +
    (number == null ? 0 : number!.hashCode) +
    (dateOfIssue == null ? 0 : dateOfIssue!.hashCode) +
    (dateOfExpiry == null ? 0 : dateOfExpiry!.hashCode);

  @override
  String toString() => 'OutletLicenseDTO[id=$id, outletId=$outletId, licenseType=$licenseType, number=$number, dateOfIssue=$dateOfIssue, dateOfExpiry=$dateOfExpiry]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.outletId != null) {
      json[r'outletId'] = this.outletId;
    } else {
      json[r'outletId'] = null;
    }
    if (this.licenseType != null) {
      json[r'licenseType'] = this.licenseType;
    } else {
      json[r'licenseType'] = null;
    }
    if (this.number != null) {
      json[r'number'] = this.number;
    } else {
      json[r'number'] = null;
    }
    if (this.dateOfIssue != null) {
      json[r'dateOfIssue'] = this.dateOfIssue!.toUtc().toIso8601String();
    } else {
      json[r'dateOfIssue'] = null;
    }
    if (this.dateOfExpiry != null) {
      json[r'dateOfExpiry'] = this.dateOfExpiry!.toUtc().toIso8601String();
    } else {
      json[r'dateOfExpiry'] = null;
    }
    return json;
  }

  /// Returns a new [OutletLicenseDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OutletLicenseDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OutletLicenseDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OutletLicenseDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OutletLicenseDTO(
        id: mapValueOfType<int>(json, r'id'),
        outletId: mapValueOfType<int>(json, r'outletId'),
        licenseType: LicenseType.fromJson(json[r'licenseType']),
        number: mapValueOfType<String>(json, r'number'),
        dateOfIssue: mapDateTime(json, r'dateOfIssue', r''),
        dateOfExpiry: mapDateTime(json, r'dateOfExpiry', r''),
      );
    }
    return null;
  }

  static List<OutletLicenseDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletLicenseDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletLicenseDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OutletLicenseDTO> mapFromJson(dynamic json) {
    final map = <String, OutletLicenseDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OutletLicenseDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OutletLicenseDTO-objects as value to a dart map
  static Map<String, List<OutletLicenseDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OutletLicenseDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OutletLicenseDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

