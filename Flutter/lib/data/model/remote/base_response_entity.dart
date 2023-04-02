import 'package:marvel_character/generated/json/base/json_field.dart';
import 'package:marvel_character/generated/json/base_response_entity.g.dart';
import 'dart:convert';

@JsonSerializable()
class BaseResponseEntity {
	String? code;
	String? status;
	String? copyright;
	String? attributionText;
	String? attributionHTML;
	BaseResponseData? data;
	String? etag;

	BaseResponseEntity();

	factory BaseResponseEntity.fromJson(Map<String, dynamic> json) => $BaseResponseEntityFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseEntityToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseData {
	String? offset;
	String? limit;
	String? total;
	String? count;
	List<BaseResponseDataResults>? results;

	BaseResponseData();

	factory BaseResponseData.fromJson(Map<String, dynamic> json) => $BaseResponseDataFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResults {
	String? id;
	String? name;
	String? description;
	String? modified;
	String? resourceURI;
	List<BaseResponseDataResultsUrls>? urls;
	BaseResponseDataResultsThumbnail? thumbnail;
	BaseResponseDataResultsComics? comics;
	BaseResponseDataResultsStories? stories;
	BaseResponseDataResultsEvents? events;
	BaseResponseDataResultsSeries? series;

	BaseResponseDataResults();

	factory BaseResponseDataResults.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsUrls {
	String? type;
	String? url;

	BaseResponseDataResultsUrls();

	factory BaseResponseDataResultsUrls.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsUrlsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsUrlsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsThumbnail {
	String? path;
	String? extension;

	BaseResponseDataResultsThumbnail();

	factory BaseResponseDataResultsThumbnail.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsThumbnailFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsThumbnailToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsComics {
	String? available;
	String? returned;
	String? collectionURI;
	List<BaseResponseDataResultsComicsItems>? items;

	BaseResponseDataResultsComics();

	factory BaseResponseDataResultsComics.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsComicsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsComicsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsComicsItems {
	String? resourceURI;
	String? name;

	BaseResponseDataResultsComicsItems();

	factory BaseResponseDataResultsComicsItems.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsComicsItemsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsComicsItemsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsStories {
	String? available;
	String? returned;
	String? collectionURI;
	List<BaseResponseDataResultsStoriesItems>? items;

	BaseResponseDataResultsStories();

	factory BaseResponseDataResultsStories.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsStoriesFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsStoriesToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsStoriesItems {
	String? resourceURI;
	String? name;
	String? type;

	BaseResponseDataResultsStoriesItems();

	factory BaseResponseDataResultsStoriesItems.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsStoriesItemsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsStoriesItemsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsEvents {
	String? available;
	String? returned;
	String? collectionURI;
	List<BaseResponseDataResultsEventsItems>? items;

	BaseResponseDataResultsEvents();

	factory BaseResponseDataResultsEvents.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsEventsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsEventsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsEventsItems {
	String? resourceURI;
	String? name;

	BaseResponseDataResultsEventsItems();

	factory BaseResponseDataResultsEventsItems.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsEventsItemsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsEventsItemsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsSeries {
	String? available;
	String? returned;
	String? collectionURI;
	List<BaseResponseDataResultsSeriesItems>? items;

	BaseResponseDataResultsSeries();

	factory BaseResponseDataResultsSeries.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsSeriesFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsSeriesToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}

@JsonSerializable()
class BaseResponseDataResultsSeriesItems {
	String? resourceURI;
	String? name;

	BaseResponseDataResultsSeriesItems();

	factory BaseResponseDataResultsSeriesItems.fromJson(Map<String, dynamic> json) => $BaseResponseDataResultsSeriesItemsFromJson(json);

	Map<String, dynamic> toJson() => $BaseResponseDataResultsSeriesItemsToJson(this);

	@override
	String toString() {
		return jsonEncode(this);
	}
}