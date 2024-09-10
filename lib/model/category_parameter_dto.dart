//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CategoryParameterDTO {
  /// Returns a new [CategoryParameterDTO] instance.
  CategoryParameterDTO({
    required this.id,
    this.name,
    required this.type,
    this.unit,
    this.description,
    this.recommendationTypes = const [],
    required this.required_,
    required this.filtering,
    required this.distinctive,
    required this.multivalue,
    required this.allowCustomValues,
    this.values = const [],
    this.constraints,
    this.valueRestrictions = const [],
  });

  /// Идентификатор характеристики.
  int id;

  /// Название характеристики.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ParameterType type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CategoryParameterUnitDTO? unit;

  /// Описание характеристики.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  List<OfferCardRecommendationType>? recommendationTypes;

  /// Обязательность характеристики.
  bool required_;

  /// Используется ли характеристика в фильтре.
  bool filtering;

  /// Является ли характеристика особенностью варианта.
  bool distinctive;

  /// Можно ли передать сразу несколько значений.
  bool multivalue;

  /// Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
  bool allowCustomValues;

  /// Список допустимых значений параметра. Только для характеристик типа `ENUM`.
  List<ParameterValueOptionDTO>? values;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ParameterValueConstraintsDTO? constraints;

  /// Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
  List<ValueRestrictionDTO>? valueRestrictions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CategoryParameterDTO &&
    other.id == id &&
    other.name == name &&
    other.type == type &&
    other.unit == unit &&
    other.description == description &&
    _deepEquality.equals(other.recommendationTypes, recommendationTypes) &&
    other.required_ == required_ &&
    other.filtering == filtering &&
    other.distinctive == distinctive &&
    other.multivalue == multivalue &&
    other.allowCustomValues == allowCustomValues &&
    _deepEquality.equals(other.values, values) &&
    other.constraints == constraints &&
    _deepEquality.equals(other.valueRestrictions, valueRestrictions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (type.hashCode) +
    (unit == null ? 0 : unit!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (recommendationTypes == null ? 0 : recommendationTypes!.hashCode) +
    (required_.hashCode) +
    (filtering.hashCode) +
    (distinctive.hashCode) +
    (multivalue.hashCode) +
    (allowCustomValues.hashCode) +
    (values == null ? 0 : values!.hashCode) +
    (constraints == null ? 0 : constraints!.hashCode) +
    (valueRestrictions == null ? 0 : valueRestrictions!.hashCode);

  @override
  String toString() => 'CategoryParameterDTO[id=$id, name=$name, type=$type, unit=$unit, description=$description, recommendationTypes=$recommendationTypes, required_=$required_, filtering=$filtering, distinctive=$distinctive, multivalue=$multivalue, allowCustomValues=$allowCustomValues, values=$values, constraints=$constraints, valueRestrictions=$valueRestrictions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'type'] = this.type;
    if (this.unit != null) {
      json[r'unit'] = this.unit;
    } else {
      json[r'unit'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.recommendationTypes != null) {
      json[r'recommendationTypes'] = this.recommendationTypes;
    } else {
      json[r'recommendationTypes'] = null;
    }
      json[r'required'] = this.required_;
      json[r'filtering'] = this.filtering;
      json[r'distinctive'] = this.distinctive;
      json[r'multivalue'] = this.multivalue;
      json[r'allowCustomValues'] = this.allowCustomValues;
    if (this.values != null) {
      json[r'values'] = this.values;
    } else {
      json[r'values'] = null;
    }
    if (this.constraints != null) {
      json[r'constraints'] = this.constraints;
    } else {
      json[r'constraints'] = null;
    }
    if (this.valueRestrictions != null) {
      json[r'valueRestrictions'] = this.valueRestrictions;
    } else {
      json[r'valueRestrictions'] = null;
    }
    return json;
  }

  /// Returns a new [CategoryParameterDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CategoryParameterDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CategoryParameterDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CategoryParameterDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CategoryParameterDTO(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name'),
        type: ParameterType.fromJson(json[r'type'])!,
        unit: CategoryParameterUnitDTO.fromJson(json[r'unit']),
        description: mapValueOfType<String>(json, r'description'),
        recommendationTypes: OfferCardRecommendationType.listFromJson(json[r'recommendationTypes']),
        required_: mapValueOfType<bool>(json, r'required')!,
        filtering: mapValueOfType<bool>(json, r'filtering')!,
        distinctive: mapValueOfType<bool>(json, r'distinctive')!,
        multivalue: mapValueOfType<bool>(json, r'multivalue')!,
        allowCustomValues: mapValueOfType<bool>(json, r'allowCustomValues')!,
        values: ParameterValueOptionDTO.listFromJson(json[r'values']),
        constraints: ParameterValueConstraintsDTO.fromJson(json[r'constraints']),
        valueRestrictions: ValueRestrictionDTO.listFromJson(json[r'valueRestrictions']),
      );
    }
    return null;
  }

  static List<CategoryParameterDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CategoryParameterDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CategoryParameterDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CategoryParameterDTO> mapFromJson(dynamic json) {
    final map = <String, CategoryParameterDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CategoryParameterDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CategoryParameterDTO-objects as value to a dart map
  static Map<String, List<CategoryParameterDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CategoryParameterDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CategoryParameterDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'required',
    'filtering',
    'distinctive',
    'multivalue',
    'allowCustomValues',
  };
}

