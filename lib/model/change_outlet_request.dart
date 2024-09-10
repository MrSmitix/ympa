//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChangeOutletRequest {
  /// Returns a new [ChangeOutletRequest] instance.
  ChangeOutletRequest({
    required this.name,
    required this.type,
    this.coords,
    this.isMain,
    this.shopOutletCode,
    this.visibility,
    required this.address,
    this.phones = const [],
    required this.workingSchedule,
    this.deliveryRules = const [],
    this.storagePeriod,
  });

  /// Название точки продаж. 
  String name;

  OutletType type;

  /// Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? coords;

  /// Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isMain;

  /// Идентификатор точки продаж, присвоенный магазином.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopOutletCode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OutletVisibilityType? visibility;

  OutletAddressDTO address;

  /// Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  List<String> phones;

  OutletWorkingScheduleDTO workingSchedule;

  /// Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  List<OutletDeliveryRuleDTO>? deliveryRules;

  /// Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? storagePeriod;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChangeOutletRequest &&
    other.name == name &&
    other.type == type &&
    other.coords == coords &&
    other.isMain == isMain &&
    other.shopOutletCode == shopOutletCode &&
    other.visibility == visibility &&
    other.address == address &&
    _deepEquality.equals(other.phones, phones) &&
    other.workingSchedule == workingSchedule &&
    _deepEquality.equals(other.deliveryRules, deliveryRules) &&
    other.storagePeriod == storagePeriod;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (type.hashCode) +
    (coords == null ? 0 : coords!.hashCode) +
    (isMain == null ? 0 : isMain!.hashCode) +
    (shopOutletCode == null ? 0 : shopOutletCode!.hashCode) +
    (visibility == null ? 0 : visibility!.hashCode) +
    (address.hashCode) +
    (phones.hashCode) +
    (workingSchedule.hashCode) +
    (deliveryRules == null ? 0 : deliveryRules!.hashCode) +
    (storagePeriod == null ? 0 : storagePeriod!.hashCode);

  @override
  String toString() => 'ChangeOutletRequest[name=$name, type=$type, coords=$coords, isMain=$isMain, shopOutletCode=$shopOutletCode, visibility=$visibility, address=$address, phones=$phones, workingSchedule=$workingSchedule, deliveryRules=$deliveryRules, storagePeriod=$storagePeriod]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'type'] = this.type;
    if (this.coords != null) {
      json[r'coords'] = this.coords;
    } else {
      json[r'coords'] = null;
    }
    if (this.isMain != null) {
      json[r'isMain'] = this.isMain;
    } else {
      json[r'isMain'] = null;
    }
    if (this.shopOutletCode != null) {
      json[r'shopOutletCode'] = this.shopOutletCode;
    } else {
      json[r'shopOutletCode'] = null;
    }
    if (this.visibility != null) {
      json[r'visibility'] = this.visibility;
    } else {
      json[r'visibility'] = null;
    }
      json[r'address'] = this.address;
      json[r'phones'] = this.phones;
      json[r'workingSchedule'] = this.workingSchedule;
    if (this.deliveryRules != null) {
      json[r'deliveryRules'] = this.deliveryRules;
    } else {
      json[r'deliveryRules'] = null;
    }
    if (this.storagePeriod != null) {
      json[r'storagePeriod'] = this.storagePeriod;
    } else {
      json[r'storagePeriod'] = null;
    }
    return json;
  }

  /// Returns a new [ChangeOutletRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChangeOutletRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChangeOutletRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChangeOutletRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChangeOutletRequest(
        name: mapValueOfType<String>(json, r'name')!,
        type: OutletType.fromJson(json[r'type'])!,
        coords: mapValueOfType<String>(json, r'coords'),
        isMain: mapValueOfType<bool>(json, r'isMain'),
        shopOutletCode: mapValueOfType<String>(json, r'shopOutletCode'),
        visibility: OutletVisibilityType.fromJson(json[r'visibility']),
        address: OutletAddressDTO.fromJson(json[r'address'])!,
        phones: json[r'phones'] is Iterable
            ? (json[r'phones'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        workingSchedule: OutletWorkingScheduleDTO.fromJson(json[r'workingSchedule'])!,
        deliveryRules: OutletDeliveryRuleDTO.listFromJson(json[r'deliveryRules']),
        storagePeriod: mapValueOfType<int>(json, r'storagePeriod'),
      );
    }
    return null;
  }

  static List<ChangeOutletRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChangeOutletRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChangeOutletRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChangeOutletRequest> mapFromJson(dynamic json) {
    final map = <String, ChangeOutletRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChangeOutletRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChangeOutletRequest-objects as value to a dart map
  static Map<String, List<ChangeOutletRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChangeOutletRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChangeOutletRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'type',
    'address',
    'phones',
    'workingSchedule',
  };
}

