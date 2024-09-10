//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoBestsellerInfoDTO {
  /// Returns a new [GetPromoBestsellerInfoDTO] instance.
  GetPromoBestsellerInfoDTO({
    required this.bestseller,
    this.entryDeadline,
  });

  /// Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
  bool bestseller;

  /// До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? entryDeadline;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoBestsellerInfoDTO &&
    other.bestseller == bestseller &&
    other.entryDeadline == entryDeadline;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bestseller.hashCode) +
    (entryDeadline == null ? 0 : entryDeadline!.hashCode);

  @override
  String toString() => 'GetPromoBestsellerInfoDTO[bestseller=$bestseller, entryDeadline=$entryDeadline]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bestseller'] = this.bestseller;
    if (this.entryDeadline != null) {
      json[r'entryDeadline'] = this.entryDeadline!.toUtc().toIso8601String();
    } else {
      json[r'entryDeadline'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromoBestsellerInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoBestsellerInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoBestsellerInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoBestsellerInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoBestsellerInfoDTO(
        bestseller: mapValueOfType<bool>(json, r'bestseller')!,
        entryDeadline: mapDateTime(json, r'entryDeadline', r''),
      );
    }
    return null;
  }

  static List<GetPromoBestsellerInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoBestsellerInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoBestsellerInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoBestsellerInfoDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromoBestsellerInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoBestsellerInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoBestsellerInfoDTO-objects as value to a dart map
  static Map<String, List<GetPromoBestsellerInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoBestsellerInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoBestsellerInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'bestseller',
  };
}

