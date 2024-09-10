//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CategoryContentParametersDTO {
  /// Returns a new [CategoryContentParametersDTO] instance.
  CategoryContentParametersDTO({
    required this.categoryId,
    this.parameters = const [],
  });

  /// Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
  int categoryId;

  /// Список характеристик.
  List<CategoryParameterDTO>? parameters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CategoryContentParametersDTO &&
    other.categoryId == categoryId &&
    _deepEquality.equals(other.parameters, parameters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (categoryId.hashCode) +
    (parameters == null ? 0 : parameters!.hashCode);

  @override
  String toString() => 'CategoryContentParametersDTO[categoryId=$categoryId, parameters=$parameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'categoryId'] = this.categoryId;
    if (this.parameters != null) {
      json[r'parameters'] = this.parameters;
    } else {
      json[r'parameters'] = null;
    }
    return json;
  }

  /// Returns a new [CategoryContentParametersDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CategoryContentParametersDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CategoryContentParametersDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CategoryContentParametersDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CategoryContentParametersDTO(
        categoryId: mapValueOfType<int>(json, r'categoryId')!,
        parameters: CategoryParameterDTO.listFromJson(json[r'parameters']),
      );
    }
    return null;
  }

  static List<CategoryContentParametersDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CategoryContentParametersDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CategoryContentParametersDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CategoryContentParametersDTO> mapFromJson(dynamic json) {
    final map = <String, CategoryContentParametersDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CategoryContentParametersDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CategoryContentParametersDTO-objects as value to a dart map
  static Map<String, List<CategoryContentParametersDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CategoryContentParametersDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CategoryContentParametersDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'categoryId',
  };
}

