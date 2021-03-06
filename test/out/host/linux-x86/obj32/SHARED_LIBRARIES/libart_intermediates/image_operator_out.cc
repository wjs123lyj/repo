#include <iostream>

#include "image.h"

// This was automatically generated by art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const ImageHeader::ImageSections& rhs) {
  switch (rhs) {
    case ImageHeader::kSectionObjects: os << "SectionObjects"; break;
    case ImageHeader::kSectionArtFields: os << "SectionArtFields"; break;
    case ImageHeader::kSectionArtMethods: os << "SectionArtMethods"; break;
    case ImageHeader::kSectionInternedStrings: os << "SectionInternedStrings"; break;
    case ImageHeader::kSectionImageBitmap: os << "SectionImageBitmap"; break;
    case ImageHeader::kSectionCount: os << "SectionCount"; break;
    default: os << "ImageHeader::ImageSections[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

// This was automatically generated by art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const ImageHeader::ImageMethod& rhs) {
  switch (rhs) {
    case ImageHeader::kResolutionMethod: os << "ResolutionMethod"; break;
    case ImageHeader::kImtConflictMethod: os << "ImtConflictMethod"; break;
    case ImageHeader::kImtUnimplementedMethod: os << "ImtUnimplementedMethod"; break;
    case ImageHeader::kCalleeSaveMethod: os << "CalleeSaveMethod"; break;
    case ImageHeader::kRefsOnlySaveMethod: os << "RefsOnlySaveMethod"; break;
    case ImageHeader::kRefsAndArgsSaveMethod: os << "RefsAndArgsSaveMethod"; break;
    case ImageHeader::kImageMethodsCount: os << "ImageMethodsCount"; break;
    default: os << "ImageHeader::ImageMethod[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

// This was automatically generated by art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const ImageHeader::ImageRoot& rhs) {
  switch (rhs) {
    case ImageHeader::kDexCaches: os << "DexCaches"; break;
    case ImageHeader::kClassRoots: os << "ClassRoots"; break;
    case ImageHeader::kImageRootsMax: os << "ImageRootsMax"; break;
    default: os << "ImageHeader::ImageRoot[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

