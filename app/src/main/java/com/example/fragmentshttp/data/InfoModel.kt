package com.example.fragmentshttp.data

import com.squareup.moshi.Json

data class InfoModel(
    val id: String? = null,
    val projectId: String? = null,
    val equipmentId: String? = null,
    val status: String? = null,
    val requestedBy: String? = null,
    val acceptedBy: Any? = null,
    val author: String? = null,
    val category: String? = null,
    val locations: Locations? = null,
    val filters: List<Filters>? = null,
    val type: String? = null,
    val organization: String? = null,
    val address: String? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val description: Any? = null,
    val prolongDates: List<String>? = null,
    val releaseDates: List<String>? = null,
    val isDummy: Boolean? = null,
    val hasDriver: Boolean? = null,
    val overwriteDate: Any? = null,
    val metaInfo: Any? = null,
    val warehouseId: Any? = null,
    val rentalDescription: Any? = null,
    val internalTransportations: InternalTransportations? = null,
    val startDateMilliseconds: Long? = null,
    val endDateMilliseconds: Long? = null,
    val equipment: Equipment? = null
) {

    data class Locations(
        val type: String? = null,
        val coordinates: List<Float>? = null
    )

    data class Filters(
        val name: String? = null,
        val value: Value? = null
    ) {

        data class Value(
            val max: Int? = null,
            val min: Int? = null
        )
    }

    data class InternalTransportations(
        val id: String? = null,
        val projectRequestId: String? = null,
        val pickUpDate: String? = null,
        val deliveryDate: String? = null,
        val description: Any? = null,
        val status: String? = null,
        val startDateOption: Any? = null,
        val endDateOption: Any? = null,
        val pickUpLocation: Locations? = null,
        val deliveryLocation: Locations? = null,
        val provider: String? = null,
        val pickUpLocationAddress: String? = null,
        val deliveryLocationAddress: String? = null,
        val pGroup: String? = null,
        val isOrganizedWithoutSam: Any? = null,
        val templatePGroup: String? = null,
        val pickUpDateMilliseconds: Long? = null,
        val deliveryDateMilliseconds: Long? = null,
        val startDateOptionMilliseconds: Any? = null,
        val endDateOptionMilliseconds: Any? = null
    )

    data class Equipment(
        val id: String? = null,
        val title: String? = null,
        val invNumber: String? = null,
        val categoryId: String? = null,
        val modelId: String? = null,
        val brandId: String? = null,
        val year: Int? = null,
        val specifications: List<Specifications>? = null,
        val weight: Int? = null,
        @Json(name = "additional_specifications")
        val additionalSpecifications: Any? = null,
        val structureId: String? = null,
        val organizationId: String? = null,
        val beaconType: Any? = null,
        val beaconId: String? = null,
        val beaconVendor: String? = null,
        val RFID: String? = null,
        val dailyPrice: Any? = null,
        val inactive: Any? = null,
        val tag: Tag? = null,
        val telematicBox: Any? = null,
        val createdAt: String? = null,
        @Json(name = "special_number")
        val specialNumber: Any? = null,
        @Json(name = "last_check")
        val lastCheck: String? = null,
        @Json(name = "next_check")
        val nextCheck: String? = null,
        @Json(name = "responsible_person")
        val responsiblePerson: Any? = null,
        @Json(name = "test_type")
        val testType: Any? = null,
        @Json(name = "unique_equipment_id")
        val uniqueEquipmentId: String? = null,
        @Json(name = "bgl_number")
        val bglNumber: String? = null,
        @Json(name = "serial_number")
        val serialNumber: Any? = null,
        val inventory: Any? = null,
        val warehouseId: String,
        val trackingTag: Any? = null,
        val workingHours: Any? = null,
        @Json(name = "navaris_criteria")
        val navarisCriteria: Any? = null,
        @Json(name = "dont_send_to_as400")
        val dontSendToAs400: Boolean? = null,
        val model: Model? = null,
        val brand: Model.Brand? = null,
        val category: Category? = null,
        val structure: Structure? = null,
        val wareHouse: Any? = null,
        val equipmentMedia: List<EquipmentMedia>? = null,
        val telematics: List<Telematics>? = null,
        val isMoving: Boolean? = null
        ) {

        data class Specifications(
            val key: String? = null,
            val value: Any? = null
        )

        data class Tag(
            val date: String? = null,
            val authorName: String? = null,
            val media: List<Any>? = null
        )

        data class Model(
            val id: String? = null,
            val name: String? = null,
            val createdAt: String? = null,
            val brand: Brand? = null
        ) {

            data class Brand(
                val id: String? = null,
                val name: String? = null,
                val createdAt: String? = null
            )
        }

        data class Category(
            val id: String? = null,
            val name: String? = null,
            @Json(name = "name_de")
            val nameDe: String? = null,
            val createdAt: String? = null,
            val media: List<String>? = null
        )

        data class Structure(
            val id: String? = null,
            val name: String? = null,
            val type: String? = null,
            val color: String? = null
        )

        data class EquipmentMedia(
            val id: String? = null,
            val name: String? = null,
            val files: List<File>? = null,
            val type: String? = null,
            val modelId: String? = null,
            val main: Boolean? = null,
            val modelType: String? = null,
            val createdAt: String? = null
        ) {

            data class File(
                val size: String? = null,
                val path: String? = null
            )
        }

        data class Telematics(
            val timestamp: Long? = null,
            val eventType: String? = null,
            val projectId: String? = null,
            val equipmentId: String? = null,
            val locationName: String? = null,
            val location: Location? = null,
            val costCenter: String? = null,
            val lastLatitude: Float? = null,
            val lastLongitude: Float? = null,
            val lastLatLonPrecise: Boolean? = null,
            val lastAddressByLatLon: String? = null
        ) {

            data class Location(
                val type: String? = null,
                val coordinates: List<List<List<List<Float>>>>? = null
            )
        }
    }
}

































